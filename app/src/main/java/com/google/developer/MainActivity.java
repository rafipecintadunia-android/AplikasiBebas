package com.google.developer;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.graphics.Color;
import android.widget.*;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showSplash();
    }

    void showSplash() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.parseColor("#7C3AED"));
        l.setGravity(Gravity.CENTER);
        l.setPadding(40,40,40,40);
        TextView t = new TextView(this);
        t.setText("RAFI\nDEVELOPER");
        t.setTextSize(36);
        t.setTextColor(Color.WHITE);
        t.setGravity(Gravity.CENTER);
        TextView s = new TextView(this);
        s.setText("\nLoading... v1.2");
        s.setTextColor(Color.WHITE);
        s.setGravity(Gravity.CENTER);
        l.addView(t); l.addView(s);
        setContentView(l);
        new Handler().postDelayed(() -> showLogin(), 2000);
    }

    void showLogin() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.parseColor("#F3E8FF"));
        l.setPadding(50,120,50,50);
        l.setGravity(Gravity.CENTER_HORIZONTAL);

        TextView title = new TextView(this);
        title.setText("LOGIN RAFI");
        title.setTextSize(28);
        title.setTextColor(Color.parseColor("#7C3AED"));
        title.setGravity(Gravity.CENTER);

        TextView hint = new TextView(this);
        hint.setText("\nUser: Rafi\nPass: 12345\n");
        hint.setGravity(Gravity.CENTER);

        EditText user = new EditText(this);
        user.setHint("Username");
        user.setBackgroundColor(Color.WHITE);
        EditText pass = new EditText(this);
        pass.setHint("Password");
        pass.setInputType(129);
        pass.setBackgroundColor(Color.WHITE);

        Button btn = new Button(this);
        btn.setText("LOGIN");
        btn.setBackgroundColor(Color.parseColor("#7C3AED"));
        btn.setTextColor(Color.WHITE);

        l.addView(title); l.addView(hint); l.addView(user); l.addView(pass); l.addView(btn);
        setContentView(l);

        btn.setOnClickListener(v -> {
            String u = user.getText().toString().trim();
            String p = pass.getText().toString().trim();
            if (u.equals("Rafi") && p.equals("12345")) {
                Toast.makeText(this, "Selamat Datang, Rafi!", Toast.LENGTH_SHORT).show();
                showDashboard();
            } else {
                Toast.makeText(this, "Login Gagal! Cek User/Pass", Toast.LENGTH_SHORT).show();
            }
        });
    }

    void showDashboard() {
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
        status.setText("\nOwner: Rafi Pecinta Dunia ✅\nVersion 1.2 - Login Edition");
        status.setGravity(Gravity.CENTER);

        layout.addView(title); layout.addView(sub);
        layout.addView(btn1); layout.addView(btn2); layout.addView(btn3);
        layout.addView(status);
        setContentView(layout);

        btn1.setOnClickListener(v -> Toast.makeText(this, "My Apps - Rafi Developer - 1 App Aktif", Toast.LENGTH_SHORT).show());
        btn2.setOnClickListener(v -> Toast.makeText(this, "Dashboard Rafi - 1.2K Download", Toast.LENGTH_SHORT).show());
        btn3.setOnClickListener(v -> Toast.makeText(this, "Siap Publish, Rafi!", Toast.LENGTH_SHORT).show());
    }
}
