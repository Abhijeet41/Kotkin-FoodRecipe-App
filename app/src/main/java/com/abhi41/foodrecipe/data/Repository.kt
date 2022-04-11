package com.abhi41.foodrecipe.data

import com.abhi41.foodrecipe.data.database.LocalDataSource
import com.abhi41.foodrecipe.data.network.RemoteDataSource
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped //it survive configuration change it going to use same instance when user rotate screen
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource
) {
    val remote = remoteDataSource
    val local = localDataSource
}