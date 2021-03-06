package org.apache.hadoop.hive.metastore.model;


public class MDevice {
  private MNode node;
  private MNodeGroup ng;
  private String dev_name;
  private int prop;
  private int status;

  public MDevice(MNode node, MNodeGroup ng, String name, int prop) {
    this.node = node;
    this.ng = ng;
    this.dev_name = name;
    this.prop = prop;
    this.status = MetaStoreConst.MDeviceStatus.SUSPECT;
  }

  public MDevice(MNode node, MNodeGroup ng, String name, int prop, int status) {
    this.node = node;
    this.ng = ng;
    this.dev_name = name;
    this.prop = prop;
    this.status = status;
  }

  public MNodeGroup getNg() {
    return ng;
  }

  public void setNg(MNodeGroup ng) {
    this.ng = ng;
  }

  public String getDev_name() {
    return dev_name;
  }

  public void setDev_name(String dev_name) {
    this.dev_name = dev_name;
  }

  public MNode getNode() {
    return node;
  }

  public void setNode(MNode node) {
    this.node = node;
  }

  public int getProp() {
    return prop;
  }

  public void setProp(int prop) {
    this.prop = prop;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }
}
