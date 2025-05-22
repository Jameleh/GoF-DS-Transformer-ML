AlertDialog.Builder builder = new AlertDialog.Builder(context);
builder.setTitle("Dialog Title")
       .setMessage("Dialog Message")
       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
           public void onClick(DialogInterface dialog, int id) {
           }
       })
       .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
           public void onClick(DialogInterface dialog, int id) {
           }
       });
AlertDialog dialog = builder.create();
dialog.show();
