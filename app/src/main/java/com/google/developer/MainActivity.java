package com.google.developer;
import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.*;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#F3E8FF"));
        layout.setPadding(40, 80, 40, 40);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);

        TextView title = new TextView(this);
        title.setText("RAFI DEVELOPER");
        title.setTextSize(30);
        title.setTextColor(Color.parseColor("#7C3AED"));
        title.setGravity(Gravity.CENTER);

        TextView sub = new TextView(this);
        sub.setText("by Rafi Pecinta Dunia\nBuild Apps • Publish • Grow\n\nSelamat Datang, Rafi!");
        sub.setTextSize(16);
        sub.setTextColor(Color.parseColor("#111827"));
        sub.setGravity(Gravity.CENTER);
        sub.setPadding(0, 20, 0, 30);

        Button btn1 = new Button(this);
        btn1.setText("📱 MY APPS - RAFI");
        btn1.setBackgroundColor(Color.parseColor("#7C3AED"));
        btn1.setTextColor(Color.WHITE);
        Button btn2 = new Button(this);
        btn2.setText("📊 DASHBOARD RAFI");
        btn2.setBackgroundColor(Color.parseColor("#059669"));
        btn2.setTextColor(Color.WHITE);
        Button btn3 = new Button(this);
        btn3.setText("🚀 PUBLISH TO PLAY STORE");
        btn3.setBackgroundColor(Color.parseColor("#DC2626"));
        btn3.setTextColor(Color.WHITE);

        TextView status = new TextView(this);
        status.setText("\nOwner: Rafi Pecinta Dunia ✅\nVersion 1.1 - Custom Edition");
        status.setGravity(Gravity.CENTER);
        status.setTextColor(Color.parseColor("#111827"));

        layout.addView(title);
        layout.addView(sub);
        layout.addView(btn1);
        layout.addView(btn2);
        layout.addView(btn3);
        layout.addView(status);
        setContentView(layout);

        btn1.setOnClickListener(v -> Toast.makeText(this, "My Apps - Rafi Developer - 1 App Aktif", Toast.LENGTH_SHORT).show());
        btn2.setOnClickListener(v -> Toast.makeText(this, "Dashboard Rafi - 1.2K Download", Toast.LENGTH_SHORT).show());
        btn3.setOnClickListener(v -> Toast.makeText(this, "Siap Publish, Rafi!", Toast.LENGTH_SHORT).show());
    }
}
