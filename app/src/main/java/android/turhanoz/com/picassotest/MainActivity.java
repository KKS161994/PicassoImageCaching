package android.turhanoz.com.picassotest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        PicassoCache.getPicassoInstance(this).load("https://cms-assets.tutsplus.com/uploads/users/21/posts/19431/featured_image/CodeFeature.jpg").placeholder(R.drawable.loading)
                .placeholder(R.drawable.loading)
                .error(R.drawable.no_image)
                .into(imageView);
      }
}
