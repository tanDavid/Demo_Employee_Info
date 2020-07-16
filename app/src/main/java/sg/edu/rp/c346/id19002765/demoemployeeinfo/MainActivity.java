package sg.edu.rp.c346.id19002765.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employee>alEmployeeList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.lvEmployee);
        alEmployeeList = new ArrayList<Employee>();

        alEmployeeList.add(new Employee("John", "Software Technical Leader", 3400));
        alEmployeeList.add(new Employee("May", "Programmer", 2200));

        adapter = new CustomAdapter(this,R.layout.row, alEmployeeList);

        lvEmployee.setAdapter(adapter);





    }
}
