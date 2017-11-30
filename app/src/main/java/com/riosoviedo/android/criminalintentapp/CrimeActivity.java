package com.riosoviedo.android.criminalintentapp;


import android.support.v4.app.Fragment;
import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
        return new CrimeFragment();
    }
}
