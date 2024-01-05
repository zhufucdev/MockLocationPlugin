# Motion Emulator Mock Location Plugin

This is a Motion Emulator plug-in based on the Android developer options API.

Motion Emulator is an Xposed-enabled location simulator with support of continuous location and sensor fake.

This plug-in is for those who don't root their phones. It comes with limited ability of
anti-detection. Also, since there's no developer API for sensor mocking,
this plug-in doesn't support it.

## Usage

### Prerequisite

Install Motion Emulator, either from [my site](https://zhufucdev.com/article/qRnydwa-LGMhGrf43tSG_)
or [GitHub](https://github.com/zhufucdev/MotionEmulator/releases).

Install this app, then activate it in Motion Emulator. You can get a more detailed guide from
[my site](https://zhufucdev.com/article/0xXK6YxSWe9nGwmmHQgsa).

### Enable developer options

It is required to enable developer options so that the mock location API can be accessed.

Different OEM come with various methods to make that hard to accomplish. Google for that
with your OEM name when you are not sure what to do.

### Select as mock location app

In the developer options, click on `Select mock location app` and select this app.
The option is usually at the very end of the list.