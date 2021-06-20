package `in`.geekofia.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideString(): String {
        return "Dependency Injected"
    }

    @Provides
    fun provideData(): Data {
        return Data("chandan", 21)
    }
}