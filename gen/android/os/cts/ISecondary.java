/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.os.cts;
public interface ISecondary extends android.os.IInterface
{
  /** Default implementation for ISecondary. */
  public static class Default implements android.os.cts.ISecondary
  {
    @Override public int getPid() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public long getElapsedCpuTime() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public java.lang.String getTimeZoneID() throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean performDiskWrite() throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.cts.ISecondary
  {
    private static final java.lang.String DESCRIPTOR = "android.os.cts.ISecondary";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.cts.ISecondary interface,
     * generating a proxy if needed.
     */
    public static android.os.cts.ISecondary asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.cts.ISecondary))) {
        return ((android.os.cts.ISecondary)iin);
      }
      return new android.os.cts.ISecondary.Stub.Proxy(obj);
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
        case TRANSACTION_getPid:
        {
          data.enforceInterface(descriptor);
          int _result = this.getPid();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getElapsedCpuTime:
        {
          data.enforceInterface(descriptor);
          long _result = this.getElapsedCpuTime();
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_getTimeZoneID:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getTimeZoneID();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_performDiskWrite:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.performDiskWrite();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.os.cts.ISecondary
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
      @Override public int getPid() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPid, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPid();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long getElapsedCpuTime() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getElapsedCpuTime, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getElapsedCpuTime();
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getTimeZoneID() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTimeZoneID, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTimeZoneID();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean performDiskWrite() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_performDiskWrite, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().performDiskWrite();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static android.os.cts.ISecondary sDefaultImpl;
    }
    static final int TRANSACTION_getPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getElapsedCpuTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getTimeZoneID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_performDiskWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(android.os.cts.ISecondary impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static android.os.cts.ISecondary getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public int getPid() throws android.os.RemoteException;
  public long getElapsedCpuTime() throws android.os.RemoteException;
  public java.lang.String getTimeZoneID() throws android.os.RemoteException;
  public boolean performDiskWrite() throws android.os.RemoteException;
}
