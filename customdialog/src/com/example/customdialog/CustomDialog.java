package com.example.customdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by shi-02 on 2015/3/13.
 */
public class CustomDialog extends Dialog {

    private Context context;
    public CustomDialog(Context context){
        super(context);
        this.context = context;
    }

    public CustomDialog(Context context,int theme){
        super(context,theme);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visitor_guide_dialog);
    }
}


