package com.google.developer;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.graphics.Color;
import android.widget.*;
import android.view.Gravity;
import android.content.Intent;
import android.net.Uri;

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
        TextView t = new TextView(this);
        t.setText("RAFI\nDEVELOPER");
        t.setTextSize(36); t.setTextColor(Color.WHITE); t.setGravity(Gravity.CENTER);
        TextView s = new TextView(this);
        s.setText("\nLoading... v1.6"); s.setTextColor(Color.WHITE); s.setGravity(Gravity.CENTER);
        l.addView(t); l.addView(s);
        setContentView(l);
        new Handler().postDelayed(() -> showLogin(), 2000);
    }

    void showLogin() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.parseColor("#F3E8FF"));
        l.setPadding(50,120,50,50); l.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView title = new TextView(this);
        title.setText("LOGIN RAFI"); title.setTextSize(28);
        title.setTextColor(Color.parseColor("#7C3AED")); title.setGravity(Gravity.CENTER);
        TextView hint = new TextView(this);
        hint.setText("\nUser: Rafi\nPass: 12345\n"); hint.setGravity(Gravity.CENTER);
        EditText user = new EditText(this); user.setHint("Username"); user.setBackgroundColor(Color.WHITE);
        EditText pass = new EditText(this); pass.setHint("Password"); pass.setInputType(129); pass.setBackgroundColor(Color.WHITE);
        Button btn = new Button(this); btn.setText("LOGIN");
        btn.setBackgroundColor(Color.parseColor("#7C3AED")); btn.setTextColor(Color.WHITE);
        l.addView(title); l.addView(hint); l.addView(user); l.addView(pass); l.addView(btn);
        setContentView(l);
        btn.setOnClickListener(v -> {
            if (user.getText().toString().trim().equals("Rafi") && pass.getText().toString().trim().equals("12345")) {
                Toast.makeText(this, "Selamat Datang, Rafi!", Toast.LENGTH_SHORT).show();
                showDashboard();
            } else Toast.makeText(this, "Login Gagal! Cek User/Pass", Toast.LENGTH_SHORT).show();
        });
    }

    void showDashboard() {
        ScrollView scroll = new ScrollView(this);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#F3E8FF"));
        layout.setPadding(40, 60, 40, 40); layout.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView title = new TextView(this);
        title.setText("RAFI DEVELOPER"); title.setTextSize(30);
        title.setTextColor(Color.parseColor("#7C3AED")); title.setGravity(Gravity.CENTER);
        TextView sub = new TextView(this);
        sub.setText("by Rafi Pecinta Dunia\nBuild Apps • Publish • Grow\n\nSelamat Datang, Rafi!");
        sub.setTextSize(16); sub.setGravity(Gravity.CENTER); sub.setPadding(0, 20, 0, 30);
        Button btn1 = new Button(this); btn1.setText("📱 MY APPS - RAFI");
        btn1.setBackgroundColor(Color.parseColor("#7C3AED")); btn1.setTextColor(Color.WHITE);
        Button btn2 = new Button(this); btn2.setText("📊 DASHBOARD RAFI");
        btn2.setBackgroundColor(Color.parseColor("#059669")); btn2.setTextColor(Color.WHITE);
        Button btn3 = new Button(this); btn3.setText("🚀 PUBLISH TO PLAY STORE");
        btn3.setBackgroundColor(Color.parseColor("#DC2626")); btn3.setTextColor(Color.WHITE);
        Button btn4 = new Button(this); btn4.setText("💬 CHAT WHATSAPP RAFI");
        btn4.setBackgroundColor(Color.parseColor("#25D366")); btn4.setTextColor(Color.WHITE);
        Button btn5 = new Button(this); btn5.setText("▶️ YOUTUBE @steven-d1k4i");
        btn5.setBackgroundColor(Color.parseColor("#FF0000")); btn5.setTextColor(Color.WHITE);
        Button btn6 = new Button(this); btn6.setText("📸 INSTAGRAM RAFI");
        btn6.setBackgroundColor(Color.parseColor("#E1306C")); btn6.setTextColor(Color.WHITE);
        Button btn7 = new Button(this); btn7.setText("🚪 LOGOUT");
        btn7.setBackgroundColor(Color.parseColor("#111827")); btn7.setTextColor(Color.WHITE);
        TextView status = new TextView(this);
        status.setText("\nOwner: Rafi Pecinta Dunia ✅\nVersion 1.6 - WA + YouTube @steven-d1k4i"); status.setGravity(Gravity.CENTER);
        layout.addView(title); layout.addView(sub);
        layout.addView(btn1); layout.addView(btn2); layout.addView(btn3);
        layout.addView(btn4); layout.addView(btn5); layout.addView(btn6); layout.addView(btn7);
        layout.addView(status);
        scroll.addView(layout);
        setContentView(scroll);
        btn1.setOnClickListener(v -> showMyApps());
        btn2.setOnClickListener(v -> showStats());
        btn3.setOnClickListener(v -> {
            Toast.makeText(this, "Membuka Play Store...", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=Rafi%20Developer&c=apps")));
        });
        btn4.setOnClickListener(v -> {
            Toast.makeText(this, "Membuka WhatsApp 081949980384...", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6281949980384?text=Halo%20Rafi%20Developer!%20Saya%20dari%20aplikasi%20kamu")));
        });
        btn5.setOnClickListener(v -> {
            Toast.makeText(this, "Membuka YouTube @steven-d1k4i...", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/@steven-d1k4i")));
        });
        btn6.setOnClickListener(v -> {
            Toast.makeText(this, "Membuka Instagram...", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/rafipecintadunia")));
        });
        btn7.setOnClickListener(v -> {
            Toast.makeText(this, "Logout Berhasil, Sampai Jumpa Rafi!", Toast.LENGTH_SHORT).show();
            showLogin();
        });
    }

    void showMyApps() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.parseColor("#F3E8FF"));
        l.setPadding(40,80,40,40); l.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView t = new TextView(this); t.setText("📱 MY APPS"); t.setTextSize(28);
        t.setTextColor(Color.parseColor("#7C3AED")); t.setGravity(Gravity.CENTER);
        TextView list = new TextView(this);
        list.setText("\n1. Rafi Developer v1.6 ✅\n   - Login + Splash + Dashboard\n   - 1.2K Download\n\n2. Sakti Bot Official\n   - Coming Soon\n\n3. Hello World\n   - Coming Soon\n");
        list.setTextSize(16); list.setBackgroundColor(Color.WHITE); list.setPadding(30,30,30,30);
        Button back = new Button(this); back.setText("⬅ KEMBALI");
        back.setBackgroundColor(Color.parseColor("#111827")); back.setTextColor(Color.WHITE);
        l.addView(t); l.addView(list); l.addView(back);
        setContentView(l);
        back.setOnClickListener(v -> showDashboard());
    }

    void showStats() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.parseColor("#F3E8FF"));
        l.setPadding(40,80,40,40); l.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView t = new TextView(this); t.setText("📊 DASHBOARD RAFI"); t.setTextSize(28);
        t.setTextColor(Color.parseColor("#059669")); t.setGravity(Gravity.CENTER);
        TextView s = new TextView(this);
        s.setText("\nTotal Download: 1.247\nRating: 4.8 ★★★★★\nTotal App: 3 App\nPengguna Aktif: 856\nPendapatan: Rp 1.250.000");
        s.setTextSize(17); s.setBackgroundColor(Color.WHITE); s.setPadding(30,30,30,30); s.setGravity(Gravity.CENTER);
        Button back = new Button(this); back.setText("⬅ KEMBALI");
        back.setBackgroundColor(Color.parseColor("#111827")); back.setTextColor(Color.WHITE);
        l.addView(t); l.addView(s); l.addView(back);
        setContentView(l);
        back.setOnClickListener(v -> showDashboard());
    }
}
