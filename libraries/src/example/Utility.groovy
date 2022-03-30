package example

class Utility implements Serializable{
  def config
  Utility(config){
    this.config = config
  }

  void doThing(steps){
    steps.echo "library config: ${config}"
  }
}
