package com.soulkitchen.androidcleanarchskeletonjava.presentation.view.base;

import android.app.Application;
import com.soulkitchen.androidcleanarchskeletonjava.presentation.components.ApplicationComponent;
import com.soulkitchen.androidcleanarchskeletonjava.presentation.modules.ApplicationModule;

public class BaseApplication extends Application {

  private ApplicationComponent mApplicationComponent;

  @Override
  public void onCreate() {
    super.onCreate();

    initDependencies();
  }


  /**
   * Initializes Dagger 2 dependencies
   * */
  private void initDependencies() {
    mApplicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this))
        .build();
  }


  public ApplicationComponent getApplicationComponent() {
    return mApplicationComponent;
  }
}
