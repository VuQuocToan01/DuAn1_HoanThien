package src.add;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.toanvu.duan1_hoanthien.R;

public class ThemDoiHinhChinh extends AppCompatActivity {
    ImageView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.them_doi_hinh_chinh);

        show= findViewById(R.id.show_doi_Hinh_chinh);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}