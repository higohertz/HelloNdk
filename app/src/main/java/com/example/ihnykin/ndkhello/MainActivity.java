package com.example.ihnykin.ndkhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    public static GLView m_View = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        nativeOnCreateNative();

        m_View = new GLView( getApplication() );

        setContentView( m_View );
    }

    public static native void nativeOnCreateNative();
    public static native void nativeSetSurface(Surface surface );
    public static native void nativeSetSurfaceSize(int width, int height );
    public static native void nativeDrawFrame();
}
