package me.panavtec.drawableview.gestures.creator;

import me.panavtec.drawableview.draw.SerializablePath;


public interface GestureCreatorListener {
  //创建新的Path对象(当Action_Up完全画完的时候)
  void onGestureCreated(SerializablePath serializablePath);
  //Path有变化（创建或置空的时候）
  void onCurrentGestureChanged(SerializablePath currentDrawingPath);
}
