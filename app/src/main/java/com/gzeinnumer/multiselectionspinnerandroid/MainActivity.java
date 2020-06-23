package com.gzeinnumer.multiselectionspinnerandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.anurag.multiselectionspinner.MultiSelectionSpinnerDialog;
import com.anurag.multiselectionspinner.MultiSpinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MultiSelectionSpinnerDialog.OnMultiSpinnerSelectionListener{

    MultiSpinner multiSpinner1;
    MultiSpinner multiSpinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiSpinner1 = findViewById(R.id.spinnerMultiSpinner1);
        multiSpinner2 = findViewById(R.id.spinnerMultiSpinner2);

        initWithImage();
        initWithOutImage();
    }

    private void initWithImage() {
        ArrayList<String> urlList = new ArrayList<>();
        urlList.add("https://cdn.pixabay.com/photo/2015/06/24/01/15/morning-819362_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2017/05/12/08/29/coffee-2306471_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2016/03/26/13/09/cup-of-coffee-1280537_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2013/08/11/19/46/coffee-171653_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2015/10/12/14/54/coffee-983955_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2016/03/30/21/59/coffee-1291656_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2018/02/16/10/52/beverage-3157395_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2017/09/04/18/39/coffee-2714970_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2017/05/19/06/22/desktop-2325627_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2016/03/26/13/09/notebook-1280538_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2016/03/26/13/09/notebook-1280538_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2016/03/26/13/09/notebook-1280538_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2016/03/26/13/09/notebook-1280538_960_720.jpg");
        urlList.add("https://cdn.pixabay.com/photo/2016/03/26/13/09/notebook-1280538_960_720.jpg");

        ArrayList<String> contentList = new ArrayList<>();
        contentList.add("One");
        contentList.add("Two");
        contentList.add("Three");
        contentList.add("Four");
        contentList.add("Five");
        contentList.add("Six");
        contentList.add("Seven");
        contentList.add("Eight");
        contentList.add("Nine");
        contentList.add("Ten");
        contentList.add("Eleven");
        contentList.add("Twelve");
        contentList.add("Thirteen");
        contentList.add("Fourteen");

        multiSpinner1.setAdapterWithImage(this,urlList,contentList,this);

        multiSpinner1.initMultiSpinner(this, multiSpinner1);

        multiSpinner1.setText(contentList.get(0));
    }

    private void initWithOutImage() {
        ArrayList<String> contentList = new ArrayList<>();
        contentList.add("One");
        contentList.add("Two");
        contentList.add("Three");
        contentList.add("Four");
        contentList.add("Five");
        contentList.add("Six");
        contentList.add("Seven");
        contentList.add("Eight");
        contentList.add("Nine");
        contentList.add("Ten");
        contentList.add("Eleven");
        contentList.add("Twelve");
        contentList.add("Thirteen");
        contentList.add("Fourteen");

        multiSpinner2.setAdapterWithOutImage(this,contentList,this);

        multiSpinner2.initMultiSpinner(this,multiSpinner2);

        multiSpinner2.setText(contentList.get(1));

    }

    private static final String TAG = "MainActivity";

    @Override
    public void OnMultiSpinnerItemSelected(List<String> chosenItems) {
        for (int i=0; i<chosenItems.size(); i++){
            Log.d(TAG, "OnMultiSpinnerItemSelected: "+chosenItems.get(i));
        }
    }
}