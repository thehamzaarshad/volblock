package com.example.volblock;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
public class MainActivity extends Activity {
@Override protected void onCreate(Bundle b) {
super.onCreate(b);
startActivity(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));
finish();
}
}
