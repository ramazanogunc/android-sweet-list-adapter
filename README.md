# Android sweet list adapter
Android sweet list adapter is a custom listview adapter. It provide convenience for create custom array adapter. 
# Usage
Add jitpack repository in the project build.gradle
```
allprojects {
 repositories {
   maven { url 'https://jitpack.io' }
  }
}
```
Add module dependecy 
```
implementation 'com.github.ramazanogunc:android-sweet-list-adapter:6eb65fd1e6'
```
Java code
```
SweetListAdapter</*class type*/> listAdapter = new SweetListAdapter<>(/*context*/,/*item layout resource*/,/*List*/);

listAdapter.setItemView(new ISweetSetItemView</*class type*/>() {
    @Override
    public void setItemView(View view, /*class type*/ item) {
        //example
        TextView tw =  view.findViewById(R.id.tw);
        TextView tw2 =  view.findViewById(R.id.tw2);
        tw.setText(""+item);
        tw2.setText(""+item);
    }
});

listView.setAdapter(listAdapter);
```

# License
[APACHE](http://www.apache.org/licenses/LICENSE-2.0)
