package com.example.jini.barcode;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] navItems = {"Home", "statistic", "information"};
    private ListView lvNavList;

    DrawerLayout dlDrawer;

    HomeFragment homeFragment;
    Information information;
    Statistic statistic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeFragment = new HomeFragment();
        information = new Information().newInstance();
        statistic = new Statistic().newInstance();

        dlDrawer = (DrawerLayout)findViewById(R.id.dl_activity_main_drawer);
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_activity_main,homeFragment).commit();
        lvNavList = (ListView)findViewById(R.id.lv_activity_main_nav_list);

        lvNavList.setAdapter(
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, navItems)
        );
        lvNavList.setOnItemClickListener(new DrawerItemClickListener());
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Fragment fr = new HomeFragment();
            switch (position){
                case 0:
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_activity_main, homeFragment).commit();
                    break;
                case 1:
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_activity_main, statistic).commit();
                    break;
                case 2:
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fl_activity_main, information).commit();
                    break;
//                case 3:
//                    flContainer.setBackgroundColor(Color.parseColor("#FF8C00"));
//                    break;
//                case 4:
//                    flContainer.setBackgroundColor(Color.parseColor("#DAA520"));
//                    break;
            }
            dlDrawer.closeDrawer(lvNavList);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
