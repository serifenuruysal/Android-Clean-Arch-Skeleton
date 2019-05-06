package com.soulkitchen.androidcleanarchskeletonjava.presentation.components;


import android.content.Context;
import com.soulkitchen.androidcleanarchskeletonjava.presentation.modules.ApplicationModule;
import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */

@ApplicationScope
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    Context context();

    // Inject your dependencies here
}
