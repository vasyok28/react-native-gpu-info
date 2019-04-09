
package com.candidegardening.gpuinfo;

import android.util.Log;

import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

public class RNGpuInfoPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      Log.i(RNGpuInfoPackage.class.getSimpleName(), "createNativeModules");
      return Collections.<NativeModule>singletonList(new RNGpuInfoModule(reactContext));
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        Log.i(RNGpuInfoPackage.class.getSimpleName(), "createJSModules");
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      return Collections.emptyList();
    }
}