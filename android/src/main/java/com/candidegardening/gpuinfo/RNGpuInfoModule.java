
package com.candidegardening.gpuinfo;

import android.preference.PreferenceManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNGpuInfoModule extends ReactContextBaseJavaModule {
  private final ReactApplicationContext reactContext;

  RNGpuInfoModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNGpuInfo";
  }


  @ReactMethod
  public String getGlRenderer() {
    return PreferenceManager.getDefaultSharedPreferences(reactContext).getString(Constants.GL_RENDERER, "");
  }
}