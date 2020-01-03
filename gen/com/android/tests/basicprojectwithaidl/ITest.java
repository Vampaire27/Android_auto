/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.android.tests.basicprojectwithaidl;
public interface ITest extends android.os.IInterface
{
  /** Default implementation for ITest. */
  public static class Default implements com.android.tests.basicprojectwithaidl.ITest
  {
    @Override public android.graphics.Rect getRect() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.android.tests.basicprojectwithaidl.ITest
  {
    private static final java.lang.String DESCRIPTOR = "com.android.tests.basicprojectwithaidl.ITest";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.android.tests.basicprojectwithaidl.ITest interface,
     * generating a proxy if needed.
     */
    public static com.android.tests.basicprojectwithaidl.ITest asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.android.tests.basicprojectwithaidl.ITest))) {
        return ((com.android.tests.basicprojectwithaidl.ITest)iin);
      }
      return new com.android.tests.basicprojectwithaidl.ITest.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_getRect:
        {
          data.enforceInterface(descriptor);
          android.graphics.Rect _result = this.getRect();
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.android.tests.basicprojectwithaidl.ITest
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public android.graphics.Rect getRect() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.graphics.Rect _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRect, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRect();
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.graphics.Rect.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.android.tests.basicprojectwithaidl.ITest sDefaultImpl;
    }
    static final int TRANSACTION_getRect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.android.tests.basicprojectwithaidl.ITest impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.android.tests.basicprojectwithaidl.ITest getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public android.graphics.Rect getRect() throws android.os.RemoteException;
}
