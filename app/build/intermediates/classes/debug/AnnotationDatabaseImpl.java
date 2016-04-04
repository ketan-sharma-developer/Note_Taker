
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.google.inject.AnnotationDatabase;
import roboguice.fragment.FragmentUtil;

public class AnnotationDatabaseImpl extends AnnotationDatabase {

    public void fillAnnotationClassesAndFieldsNames(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToFieldSet) {
    
        String annotationClassName = null;
        Map<String, Set<String>> mapClassWithInjectionNameToFieldSet = null;
        Set<String> fieldNameSet = null;


        annotationClassName = "roboguice.inject.InjectView";
        mapClassWithInjectionNameToFieldSet = mapAnnotationToMapClassWithInjectionNameToFieldSet.get(annotationClassName);
        if( mapClassWithInjectionNameToFieldSet == null ) {
            mapClassWithInjectionNameToFieldSet = new HashMap<String, Set<String>>();
            mapAnnotationToMapClassWithInjectionNameToFieldSet.put(annotationClassName, mapClassWithInjectionNameToFieldSet);
        }

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("listView");
        fieldNameSet.add("emptyListTextView");
        fieldNameSet.add("addNoteButton");
        mapClassWithInjectionNameToFieldSet.put("com.notetaker.activity.MainActivity", fieldNameSet);

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("versionText");
        mapClassWithInjectionNameToFieldSet.put("com.notetaker.widget.AboutNoticeDialog", fieldNameSet);

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("noteUpdatedAtDateText");
        fieldNameSet.add("noteTitleText");
        fieldNameSet.add("noteContentText");
        fieldNameSet.add("noteCreatedAtDateText");
        fieldNameSet.add("editNoteButton");
        fieldNameSet.add("scrollView");
        mapClassWithInjectionNameToFieldSet.put("com.notetaker.activity.ViewActivity", fieldNameSet);

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("noteTitleText");
        fieldNameSet.add("noteContentText");
        mapClassWithInjectionNameToFieldSet.put("com.notetaker.activity.EditActivity", fieldNameSet);


        annotationClassName = "com.google.inject.Inject";
        mapClassWithInjectionNameToFieldSet = mapAnnotationToMapClassWithInjectionNameToFieldSet.get(annotationClassName);
        if( mapClassWithInjectionNameToFieldSet == null ) {
            mapClassWithInjectionNameToFieldSet = new HashMap<String, Set<String>>();
            mapAnnotationToMapClassWithInjectionNameToFieldSet.put(annotationClassName, mapClassWithInjectionNameToFieldSet);
        }

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("DAOInterface");
        mapClassWithInjectionNameToFieldSet.put("com.notetaker.activity.MainActivity", fieldNameSet);

    }
    
    public void fillAnnotationClassesAndMethods(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToMethodsSet) {
    }
    
    public void fillAnnotationClassesAndConstructors(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToConstructorsSet) {

        String annotationClassName = null;
        Map<String, Set<String>> mapClassWithInjectionNameToConstructorSet = null;
        Set<String> constructorSet = null;


        annotationClassName = "com.google.inject.Inject";
        mapClassWithInjectionNameToConstructorSet = mapAnnotationToMapClassWithInjectionNameToConstructorsSet.get(annotationClassName);
        if( mapClassWithInjectionNameToConstructorSet == null ) {
            mapClassWithInjectionNameToConstructorSet = new HashMap<String, Set<String>>();
            mapAnnotationToMapClassWithInjectionNameToConstructorsSet.put(annotationClassName, mapClassWithInjectionNameToConstructorSet);
        }

        constructorSet = new HashSet<String>();
        constructorSet.add("<init>:android.database.sqlite.SQLiteOpenHelper");
        mapClassWithInjectionNameToConstructorSet.put("com.notetaker.data.dao.impl.sqlite.SQLiteDAOInterface", constructorSet);

    }
    
    public void fillClassesContainingInjectionPointSet(HashSet<String> classesContainingInjectionPointsSet) {
        classesContainingInjectionPointsSet.add("com.notetaker.activity.MainActivity");
        classesContainingInjectionPointsSet.add("com.notetaker.widget.AboutNoticeDialog");
        classesContainingInjectionPointsSet.add("com.notetaker.data.dao.impl.sqlite.SQLiteDAOInterface");
        classesContainingInjectionPointsSet.add("com.notetaker.activity.ViewActivity");
        classesContainingInjectionPointsSet.add("com.notetaker.activity.EditActivity");
    }
    

    public void fillBindableClasses(HashSet<String> injectedClasses) {
        injectedClasses.add("android.support.design.widget.FloatingActionButton");
        injectedClasses.add("android.widget.ListView");
        injectedClasses.add("com.notetaker.data.dao.DAOInterface");
        injectedClasses.add("android.widget.TextView");
        injectedClasses.add("android.widget.EditText");
        injectedClasses.add("android.widget.ScrollView");
        injectedClasses.add("android.database.sqlite.SQLiteOpenHelper");

        if(FragmentUtil.hasNative) {
            injectedClasses.add("android.app.FragmentManager");
        }

        if(FragmentUtil.hasSupport) {
            injectedClasses.add("android.support.v4.app.FragmentManager");
        }
    }

}
