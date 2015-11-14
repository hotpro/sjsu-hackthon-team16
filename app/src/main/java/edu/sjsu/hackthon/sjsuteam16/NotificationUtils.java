package edu.sjsu.hackthon.sjsuteam16;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by yunlongxu on 11/13/15.
 */
public class NotificationUtils {
    public static void showNotification(Context context, int id) {
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
//                        .setLargeIcon(getBitmapFromAsset(context, "ic_push_msg.png"))
                        .setSmallIcon(R.drawable.ic_push_msg)
                        .setContentTitle("GAMESTOP Notification")
                        .setContentText("Game Promotion");

        // Creates an explicit intent for an Activity in app
        Intent resultIntent = new Intent(context, GameInfoActivity.class);

        // The stack builder object will contain an aritificial back stack for the
        // started Activity
        // This ensures that navigating backward from the Activity leads out of
        // application to the Home Screen
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        // Adds the back stack for the Intent
        stackBuilder.addParentStack(MainActivity.class);
        // Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(
                        0,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(id > 0 ? id : 1000, mBuilder.build());
    }

    public static Bitmap getBitmapFromAsset(Context context, String filePath) {
        AssetManager assetManager = context.getAssets();

        InputStream istr;
        Bitmap bitmap = null;
        try {
            istr = assetManager.open(filePath);
            bitmap = BitmapFactory.decodeStream(istr);
        } catch (IOException e) {
            // handle exception
        }

        return bitmap;
    }
}
