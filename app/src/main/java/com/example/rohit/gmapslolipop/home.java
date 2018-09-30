package com.example.rohit.gmapslolipop;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class home extends Fragment {
    private static final String TAG = "MainActivity";
    View rootView;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private RecyclerView recyclerView;

    public home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        getImages();
        // Inflate the layout for this fragment
        recyclerView = rootView.findViewById(R.id.recycle);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this.getActivity(), mImageUrls);
        recyclerView.setAdapter(adapter);
        Log.d(TAG, "initRecyclerView: init recyclerview");
        return rootView;
    }

    private void getImages() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.adventurenation.com/semcms/media/offers/2016/Aug/8de63680059345b6bf830f226c0a9c59.jpg");
        mImageUrls.add("https://www.adventurenation.com/semcms/media/offers/2017/Jan/42cdd1969e0867ea7fff8623d086cd06.jpg");
        mImageUrls.add("https://www.adventurenation.com/semcms/media/offers/2017/Nov/f8c0f152c3aa77fd6769a30df2661f87.jpg");
        mImageUrls.add("https://www.adventurenation.com/semcms/media/offers/2016/Sep/82b1cab8190a32a2272d6a261dd8828c.jpg");
        mImageUrls.add("https://www.adventurenation.com/semcms/media/offers/2016/Oct/3b1382fbc49d54746e55deaf1f388887.jpg");
        mImageUrls.add("https://www.adventurenation.com/semcms/media/offers/2016/Nov/bf106e5620e413c10dc5491f4481571c.jpg");
        mImageUrls.add("https://www.adventurenation.com/semcms/media/offers/2015/Apr/f80813de162aa3abe3a8d30f80f16f74.jpg");

    }
}
