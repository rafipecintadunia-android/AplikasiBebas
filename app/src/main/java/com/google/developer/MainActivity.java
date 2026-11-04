package com.google.developer;
import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.*;
import android.view.Gravity;
import android.view.ViewGroup;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.WHITE);
        layout.setPadding(40, 80, 40, 40);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);

        TextView title = new TextView(this);
        title.setText("Google Developer");
        title.setTextSize(28);
        title.setTextColor(Color.parseColor("#4285F4"));
        title.setGravity(Gravity.CENTER);

        TextView sub = new TextView(this);
        sub.setText("Build Apps • Publish • Grow\n\nSelamat Datang Developer!");
        sub.setTextSize(16);
        sub.setGravity(Gravity.CENTER);
        sub.setPadding(0, 20, 0, 30);

        Button btn1 = new Button(this);
        btn1.setText("📱 My Apps");
        Button btn2 = new Button(this);
        btn2.setText("📊 Dashboard");
        Button btn3 = new Button(this);
        btn3.setText("🚀 Publish to Play Store");

        TextView status = new TextView(this);
        status.setText("\nStatus: Connected to GitHub Actions ✅\nVersion 1.0 - Build Success");
        status.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(sub);
        layout.addView(btn1);
        layout.addView(btn2);
        layout.addView(btn3);
        layout.addView(status);
        setContentView(layout);

        btn1.setOnClickListener(v -> Toast.makeText(this, "My Apps - 1 App Aktif", Toast.LENGTH_SHORT).show());
        btn2.setOnClickListener(v -> Toast.makeText(this, "Dashboard - 1.2K Download", Toast.LENGTH_SHORT).show());
        btn3.setOnClickListener(v -> Toast.makeText(this, "Siap Publish!", Toast.LENGTH_SHORT).show());
    }
}
