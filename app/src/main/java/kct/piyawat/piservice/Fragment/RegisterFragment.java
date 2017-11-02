package kct.piyawat.piservice.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kct.piyawat.piservice.MainActivity;
import kct.piyawat.piservice.R;

/**
 * Created by asus on 31/10/2560.
 */

public class RegisterFragment extends Fragment{

//    Create Main Method คือ เมธอดที่ทำหน้าที่ เป็นผู้จัดการ


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

    } // Main Method

    private void createToolbar() {
//        Initial View คือการ Inflater View เข้ามาทำงานใน Java

        Toolbar toolbar = getView().findViewById(R.id.toolbarRegister);

//        Setup Toolbar คือการกำหนดให้ Toolbar ทำงาน
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

    }

    //    เมธอค ที่ใช้ในการสร้าง หน้ากาก
//    Create Fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register,container,false);

        return view;
    }
}// Main Class
