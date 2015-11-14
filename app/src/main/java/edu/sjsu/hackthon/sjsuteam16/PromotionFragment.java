package edu.sjsu.hackthon.sjsuteam16;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

import edu.sjsu.hackthon.sjsuteam16.adapter.CardAdapter;
import edu.sjsu.hackthon.sjsuteam16.adapter.PromotionAdapter;
import edu.sjsu.hackthon.sjsuteam16.model.Github;
import edu.sjsu.hackthon.sjsuteam16.model.Promotion;
import edu.sjsu.hackthon.sjsuteam16.service.GithubService;
import edu.sjsu.hackthon.sjsuteam16.service.PromotionService;
import edu.sjsu.hackthon.sjsuteam16.service.ServiceFactory;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by yutao on 11/13/15.
 */
public class PromotionFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PromotionFragment newInstance(int sectionNumber) {
        PromotionFragment fragment = new PromotionFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PromotionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_promotion, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupGithub();
    }

    private void setupGithub() {
        /**
         * Set up Android CardView/RecycleView
         */
        RecyclerView mRecyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        final PromotionAdapter mCardAdapter = new PromotionAdapter(getActivity());
        mRecyclerView.setAdapter(mCardAdapter);

        /**
         * START: button set up
         */

        PromotionService service = ServiceFactory.createRetrofitService(PromotionService.class, Constant.BASE_URL);
        service.getPromotion(Constant.CLIENT_ID, Constant.CLIENT_SECRET)
                .enqueue(new Callback<List<Promotion>>() {
                    @Override
                    public void onResponse(Response<List<Promotion>> response, Retrofit retrofit) {
                        mCardAdapter.addAllData(response.body());
                    }

                    @Override
                    public void onFailure(Throwable t) {

                    }
                });
        /**
         * END: button set up
         */

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }
}

