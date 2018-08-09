package md56f3a652ef335bdc955a5f3c8e9a7ea2d;


public class DataConnection_GetAndSet
	extends android.os.AsyncTask
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_doInBackground:([Ljava/lang/Object;)Ljava/lang/Object;:GetDoInBackground_arrayLjava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("App4.Models.DataConnection+GetAndSet, App4", DataConnection_GetAndSet.class, __md_methods);
	}


	public DataConnection_GetAndSet ()
	{
		super ();
		if (getClass () == DataConnection_GetAndSet.class)
			mono.android.TypeManager.Activate ("App4.Models.DataConnection+GetAndSet, App4", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object doInBackground (java.lang.Object[] p0)
	{
		return n_doInBackground (p0);
	}

	private native java.lang.Object n_doInBackground (java.lang.Object[] p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
