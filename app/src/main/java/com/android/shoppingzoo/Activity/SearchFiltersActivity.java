package com.android.shoppingzoo.Activity;

import static com.android.shoppingzoo.Fragment.HomeFragment.clearClicked;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.shoppingzoo.Fragment.HomeFragment;
import com.android.shoppingzoo.Model.Utils;
import com.android.shoppingzoo.R;

public class SearchFiltersActivity extends AppCompatActivity implements View.OnClickListener {
    TextView clearFilters;
    LinearLayout categoryArt1, categoryArt2, categoryArt3, categoryArt4, categoryArt5, categoryArt6, categoryArt7, categoryArt8;
    LinearLayout brandcolorK1, brandcolorK2, brandcolorK3, brandcolorK4;
    LinearLayout sizeRegular, sizePlus, sizeJunior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_filters);
        Utils.statusBarColor(SearchFiltersActivity.this);

        initAll();

        clearFilters.setOnClickListener(this);

        categoryArt1.setOnClickListener(this);
        categoryArt2.setOnClickListener(this);
        categoryArt3.setOnClickListener(this);
        categoryArt4.setOnClickListener(this);
        categoryArt5.setOnClickListener(this);
        categoryArt6.setOnClickListener(this);
        categoryArt7.setOnClickListener(this);
        categoryArt8.setOnClickListener(this);

        brandcolorK1.setOnClickListener(this);
        brandcolorK2.setOnClickListener(this);
        brandcolorK3.setOnClickListener(this);
        brandcolorK4.setOnClickListener(this);

        sizeRegular.setOnClickListener(this);
        sizePlus.setOnClickListener(this);
        sizeJunior.setOnClickListener(this);

    }

    private void initAll() {
        clearFilters = findViewById(R.id.id_clear_btn);

        categoryArt1 = findViewById(R.id.art1);
        categoryArt2 = findViewById(R.id.art2);
        categoryArt3 = findViewById(R.id.art3);
        categoryArt4 = findViewById(R.id.art4);
        categoryArt5 = findViewById(R.id.art5);
        categoryArt6 = findViewById(R.id.art6);
        categoryArt7 = findViewById(R.id.art7);
        categoryArt8 = findViewById(R.id.art8);


        brandcolorK1 = findViewById(R.id.colorK1);
        brandcolorK2 = findViewById(R.id.colorK2);
        brandcolorK3 = findViewById(R.id.colorK3);
        brandcolorK4 = findViewById(R.id.colorK4);

        sizeRegular = findViewById(R.id.size_regular);
        sizePlus = findViewById(R.id.size_plus);
        sizeJunior = findViewById(R.id.size_junior);

    }

    public void goBack(View view) {
        finish();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.art1:
                HomeFragment.category = "احمد المغلوث";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.art2:
                HomeFragment.category = "احمد فلمبان";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.art3:
                HomeFragment.category = "زهير طوله";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.art4:
                HomeFragment.category = "سمير الدهام";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.art5:
                HomeFragment.category = "سعد العبيد";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.art6:
                HomeFragment.category = "مثلى النوشان";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.art7:
                HomeFragment.category = "ليان الجريش";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.art8:
                HomeFragment.category = "سارة ابو عبدالله";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.colorK1:
                HomeFragment.category = "الوان الزيت";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.colorK2:
                HomeFragment.brand = "اكريليك";
                HomeFragment.isBrandSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.colorK3:
                HomeFragment.brand = "خشبية";
                HomeFragment.isBrandSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.colorK4:
                HomeFragment.brand = "الوان مائية";
                HomeFragment.isBrandSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.size_regular:
                HomeFragment.sizeType = "21x30";
                HomeFragment.issizeTypeSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
            case R.id.size_plus:
                HomeFragment.sizeType = "30x40";
                HomeFragment.issizeTypeSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
            case R.id.size_junior:
                HomeFragment.sizeType = "50x70";
                HomeFragment.issizeTypeSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.id_clear_btn:
                clearClicked();
                finish();
                break;
        }
    }
}