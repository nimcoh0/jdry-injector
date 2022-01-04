The injector inject Class and Filed  . can use exist class instance in the jvm 

to inject class :

    Object[] inject(String fullClassName,Object[] args,Class[] types,ClassType classType)

> if *enable_session* == true  it will first look at the jvm and if
> found (instance's  of this class) will return the first occurrence

 

**classType** :

SINGLETON,  
INITIALIZE,  
INITIALIZE_NO_PARAM

> singleton indicate by a private constructor and *getInstance* method  existent


**fullClassName** :
full class name domain and class name separated by "_" 

example :

    injector.inject(fullClassName,args,types,classType);

to inject field :

    Object inject(String fullClassName,String var,Object value)

**var** : it's the field name
**value** : it's the value yo assign to this field ; 

example :

    injector.inject(fullClassName,varname,value);

to get list of existing instance of class in the jvm 

    Object[] objects =  injector.getInstances(fullClassName);

to execute GC 

    injector.executeGC();


## Configuration

will load if found configuration.yaml at the root of the project .

## Default configuration
enable_session == true
