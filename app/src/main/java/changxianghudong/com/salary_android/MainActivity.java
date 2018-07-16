package changxianghudong.com.salary_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.qq.e.ads.banner.ADSize;
import com.qq.e.ads.banner.AbstractBannerADListener;
import com.qq.e.ads.banner.BannerView;
import com.qq.e.comm.util.AdError;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String appId = "107046090";
        String bannerPosID = "2030733674894376";
        BannerView banner = new BannerView(this, ADSize.BANNER, appId, bannerPosID);
        banner.setRefresh(30);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        banner.setADListener(new AbstractBannerADListener() {

            @Override
            public void onNoAD(AdError adError) {
                Log.d("dsadsadsa","onNoAD");
            }

            @Override
            public void onADReceiv() {
                Log.d("dsadsadsa","onADReceiv");
            }

            @Override
            public void onADExposure() {
                super.onADExposure();
                Log.d("dsadsadsa","onADExposure");
            }

            @Override
            public void onADClosed() {
                super.onADClosed();
                Log.d("dsadsadsa","onADClosed");
            }

            @Override
            public void onADClicked() {
                super.onADClicked();
                Log.d("dsadsadsa","onADClicked");
            }

            @Override
            public void onADLeftApplication() {
                super.onADLeftApplication();
                Log.d("dsadsadsa","onADLeftApplication");
            }

            @Override
            public void onADOpenOverlay() {
                super.onADOpenOverlay();
                Log.d("dsadsadsa","onADOpenOverlay");
            }

            @Override
            public void onADCloseOverlay() {
                super.onADCloseOverlay();
                Log.d("dsadsadsa","onADCloseOverlay");
            }
        });
        banner.loadAD();
        ViewGroup viewGroup = this.findViewById(R.id.bannerContainer);
        viewGroup.addView(banner);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
