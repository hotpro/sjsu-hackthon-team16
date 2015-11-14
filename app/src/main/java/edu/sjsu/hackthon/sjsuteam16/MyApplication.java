package edu.sjsu.hackthon.sjsuteam16;

import android.app.Application;

//import com.ibm.mobile.services.data.IBMData;

/**
 * Created by yutao on 11/13/15.
 */
public class MyApplication extends Application {
//    public static IBMPush push = null;
//    private Activity mActivity;
//    private static final String deviceAlias = "TargetDevice";
//    private static final String consumerID = "MBaaSListApp";
//    private static final String APP_ID = "applicationID";
//    private static final String APP_SECRET = "applicationSecret";
//    private static final String APP_ROUTE = "applicationRoute";
//    private static final String PROPS_FILE = "bluelist.properties";
//    public static final int EDIT_ACTIVITY_RC = 1;
//    private static final String CLASS_NAME = MyApplication.class
//            .getSimpleName();
////    List<Item> itemList;
//    private IBMPushNotificationListener notificationListener = null;
//
//    public MyApplication() {
//        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
//            @Override
//            public void onActivityCreated(Activity activity,Bundle savedInstanceState) {
//                Log.d(CLASS_NAME, "Activity created: " + activity.getLocalClassName());
//                mActivity = activity;
//
//                // Define IBMPushNotificationListener behavior on push notifications.
//                notificationListener = new IBMPushNotificationListener() {
//                    @Override
//                    public void onReceive(final IBMSimplePushNotification message) {
//                        mActivity.runOnUiThread(new Runnable(){
//                            @Override
//                            public void run() {
//                                Log.e(CLASS_NAME, "Notification message received: " + message.toString());
//                                Class<? extends Activity> actClass = mActivity.getClass();
//                                if (actClass == MainActivity.class) {
////                                    ((MainActivity)mActivity).listItems();
//                                    Log.e(CLASS_NAME, "Notification message received: " + message.toString());
//                                    // Present the message when sent from Push notification console.
//                                    if(!message.getAlert().contains("ItemList was updated")){
//                                        mActivity.runOnUiThread(new Runnable() {
//                                            public void run() {
//                                                new AlertDialog.Builder(mActivity)
//                                                        .setTitle("Push notification received")
//                                                        .setMessage(message.getAlert())
//                                                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
//                                                            public void onClick(DialogInterface dialog, int whichButton) {
//                                                            }
//                                                        })
//                                                        .show();
//                                            }
//                                        });
//
//                                    }
//                                }
//                            }
//                        });
//                    }
//                };
//            }
//            @Override
//            public void onActivityStarted(Activity activity) {
//                mActivity = activity;
//                Log.d(CLASS_NAME, "Activity started: " + activity.getLocalClassName());
//            }
//            @Override
//            public void onActivityResumed(Activity activity) {
//                mActivity = activity;
//                Log.d(CLASS_NAME, "Activity resumed: " + activity.getLocalClassName());
//                if (push != null) {
//                    push.listen(notificationListener);
//                }
//            }
//            @Override
//            public void onActivitySaveInstanceState(Activity activity,Bundle outState) {
//                Log.d(CLASS_NAME, "Activity saved instance state: " + activity.getLocalClassName());
//            }
//            @Override
//            public void onActivityPaused(Activity activity) {
//                if (push != null) {
//                    push.hold();
//                }
//                Log.d(CLASS_NAME, "Activity paused: " + activity.getLocalClassName());
//                if (activity != null && activity.equals(mActivity))
//                    mActivity = null;
//            }
//            @Override
//            public void onActivityStopped(Activity activity) {
//                Log.d(CLASS_NAME, "Activity stopped: " + activity.getLocalClassName());
//            }
//            @Override
//            public void onActivityDestroyed(Activity activity) {
//                Log.d(CLASS_NAME, "Activity destroyed: " + activity.getLocalClassName());
//            }
//        });
//    }
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
////        itemList = new ArrayList<Item>();
//        // Read from properties file.
//        Properties props = new java.util.Properties();
//        Context context = getApplicationContext();
//        try {
//            AssetManager assetManager = context.getAssets();
//            props.load(assetManager.open(PROPS_FILE));
//            Log.i(CLASS_NAME, "Found configuration file: " + PROPS_FILE);
//        } catch (FileNotFoundException e) {
//            Log.e(CLASS_NAME, "The bluelist.properties file was not found.", e);
//        } catch (IOException e) {
//            Log.e(CLASS_NAME, "The bluelist.properties file could not be read properly.", e);
//        }
//        Log.i(CLASS_NAME, "Application ID is: " + props.getProperty(APP_ID));
//
//        // Initialize the IBM core backend-as-a-service.
//        IBMBluemix.initialize(this, props.getProperty(APP_ID), props.getProperty(APP_SECRET), props.getProperty(APP_ROUTE));
//        // Initialize the IBM Data Service.
////        IBMData.initializeService();
//        // Register Item Specialization here.
////        Item.registerSpecialization(Item.class);
//        // Initialize IBM Push service.
//        IBMPush.initializeService();
//        // Retrieve instance of the IBM Push service.
//        push = IBMPush.getService();
//        // Register the device with the IBM Push service.
//
//
//        push.register(deviceAlias, consumerID).continueWith(new Continuation<String, Void>() {
//
//            @Override
//            public Void then(Task<String> task) throws Exception {
//                if (task.isCancelled()) {
//                    Log.e(CLASS_NAME, "Exception : Task " + task.toString() + " was cancelled.");
//                } else if (task.isFaulted()) {
//                    Log.e(CLASS_NAME, "Exception : " + task.getError().getMessage());
//                } else {
//                    Log.d(CLASS_NAME, "Device Successfully Registered");
//                }
//
//                return null;
//            }
//
//        });
//    }
}
