package edu.sjsu.hackthon.sjsuteam16.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import java.util.ArrayList;
import java.util.List;

import edu.sjsu.hackthon.sjsuteam16.GameInfoActivity;
import edu.sjsu.hackthon.sjsuteam16.R;
import edu.sjsu.hackthon.sjsuteam16.model.Promotion;

public class PromotionAdapter extends RecyclerView.Adapter<PromotionAdapter.ViewHolder> {
    List<Promotion> mItems;
    private LayoutInflater inflater;

    private DisplayImageOptions options;
    private Context context;

    public PromotionAdapter(Context context) {
        super();
        this.context = context;
        mItems = new ArrayList<>();
        inflater = LayoutInflater.from(context);

        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.ic_stub)
                .showImageForEmptyUri(R.drawable.ic_empty)
                .showImageOnFail(R.drawable.ic_error)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .considerExifParams(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();
    }

    public void addData(Promotion promotion) {
        mItems.add(promotion);
        notifyDataSetChanged();
    }

    public void addAllData(List<Promotion> data) {
        mItems.addAll(data);
        notifyDataSetChanged();
    }

    public void clear() {
        mItems.clear();
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.promotion_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        v.setOnClickListener(viewHolder);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int i) {
        Promotion promotion = mItems.get(i);
        holder.login.setText(promotion.getTITLE());
        String[] spStr = promotion.getEFFECTIVE_START_TS().split(" ");
        holder.repos.setText("start: " + spStr[0]);
        spStr = promotion.getEFFECTIVE_END_TS().split(" ");
        holder.blog.setText("end: " + spStr[0]);
        holder.origin.setText("Original Price: $" + promotion.getORIGINAL_PRICE());
        holder.promo.setText("OnSale Price: $" + promotion.getBENEFIT_VALUE());
        ImageLoader.getInstance()
                .displayImage(mItems.get(i).getLARGE_IMAGE_URI(), holder.pic, options, new SimpleImageLoadingListener() {
                    @Override
                    public void onLoadingStarted(String imageUri, View view) {
                    }

                    @Override
                    public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                    }

                    @Override
                    public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                    }
                }, new ImageLoadingProgressListener() {
                    @Override
                    public void onProgressUpdate(String imageUri, View view, int current, int total) {
                    }
                });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView login;
        public TextView repos;
        public TextView blog;
        public TextView origin;
        public TextView promo;
        public ImageView pic;

        public ViewHolder(View itemView) {
            super(itemView);
            login = (TextView) itemView.findViewById(R.id.login);
            repos = (TextView) itemView.findViewById(R.id.repos);
            blog = (TextView) itemView.findViewById(R.id.blog);
            origin = (TextView) itemView.findViewById(R.id.origin);
            promo = (TextView) itemView.findViewById(R.id.promo);
            //promo.setTextColor(Color.parseColor("#FFFFFF"));
            pic = (ImageView) itemView.findViewById(R.id.pic);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, GameInfoActivity.class);
            context.startActivity(intent);
        }
    }
}