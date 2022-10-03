package com.example.moduleinstallincomponent

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {
    @SQLQualifier
    @Provides
    fun providesSqlUserRepository(sqlRepository: SQLRepository) : UserRepository {
        return sqlRepository
    }

    @Named("Firebase")
    @Provides
    fun providesFirebaseUserRepository() : UserRepository {
        return FirebaseRepository()
    }
}

/*
@InstallIn(ActivityComponent::class)
@Module
abstract class UserModule {
    @Binds
    abstract fun providesUserRepository(sqlRepository: SQLRepository) : UserRepository
}*/
