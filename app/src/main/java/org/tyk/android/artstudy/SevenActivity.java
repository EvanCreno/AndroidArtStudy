package org.tyk.android.artstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SevenActivity extends AppCompatActivity {


    private NestedParentLayout nestedParentLayout;
    private NestedChildLayout nestedChildLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        init();
    }


    private void init() {
        nestedParentLayout = (NestedParentLayout) findViewById(R.id.nested_parent);
        nestedChildLayout = (NestedChildLayout) findViewById(R.id.nested_child);
    }
}
