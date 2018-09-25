package com.dicoding.associate.latihan3;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.picikan_peta) Button picikanPeta;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picikanPeta.setOnClickListener(this);
    }

    @Override
    public void onClick(View gangan){
        switch (gangan.getId()){
            case R.id.picikan_peta:
                String query = "https://www.bing.com/maps?osid=86eb845b-450f-4939-995e-f1aa4f79d9c9&cp=31.710201~35.071011&lvl=9&v=2&sV=2&form=S00027";
                Intent intenttujuanAdin = new Intent(Intent.ACTION_WEB_SEARCH);
                intenttujuanAdin.putExtra(SearchManager.QUERY,query );
                startActivity(intenttujuanAdin);
                break;
        }
    }
}
