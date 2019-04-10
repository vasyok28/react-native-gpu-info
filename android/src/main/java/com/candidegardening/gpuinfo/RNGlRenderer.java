package com.candidegardening.gpuinfo;

import android.content.SharedPreferences;
import android.opengl.GLSurfaceView;
import android.util.Log;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Stub {@link GLSurfaceView} render added to the
 * view hierarchy to glean {@link GL10} data.
 */
class RNGlRenderer implements GLSurfaceView.Renderer {
    private final SharedPreferences shardedPreferences;

    RNGlRenderer(final SharedPreferences shardedPreferences) {
        this.shardedPreferences = shardedPreferences;
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        shardedPreferences
                .edit()
                .putString(Constants.GL_RENDERER, gl.glGetString(GL10.GL_RENDERER))
                .apply();
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        // No-op
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        // No-op
    }
}
