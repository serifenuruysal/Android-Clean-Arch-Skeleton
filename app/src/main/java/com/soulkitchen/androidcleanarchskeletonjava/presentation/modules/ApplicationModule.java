package com.soulkitchen.androidcleanarchskeletonjava.presentation.modules;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

/**
 * Dagger module that provides objects which will live during the application lifecycle.
 */

@Module
public class ApplicationModule {

    private final Context mApplicationContext;


    public ApplicationModule(Context applicationContext) {
        mApplicationContext = applicationContext;
    }


    @Provides
    @ApplicationScope
    Context provideContext() {
        return mApplicationContext;
    }


    // ---------------------------------------------------------
    // @Provide Dependency methods related to Presentation layer
    // should be provided here
    // ---------------------------------------------------------
}
