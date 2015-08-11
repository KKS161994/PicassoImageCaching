package android.turhanoz.com.picassotest;
import android.app.Application;
import android.content.Context;
import android.os.Environment;

import com.squareup.picasso.Downloader;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import java.io.File;

public class PicassoCache extends Application {
   private static Picasso picassoInstance = null;
    private PicassoCache (Context context) {
        Downloader downloader   = new OkHttpDownloader(context, Integer.MAX_VALUE);
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(downloader);
        picassoInstance = builder.build();

    }
    /*private PicassoCache (Context context) {
        Downloader downloader   = new OkHttpDownloader(new File(Environment.getExternalStorageDirectory()+"/PicassoCache"), Integer.MAX_VALUE);
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(downloader);
        picassoInstance = builder.build();

    }*/
    public static Picasso getPicassoInstance (Context context) {


        if (picassoInstance == null) {

            new PicassoCache(context);
            return picassoInstance;
        }

        return picassoInstance;
    }
}
