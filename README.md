The injector inject Class and Filed at a remount Jvm  .

to inject class :

    Object[] inject(String fullClassName,Object[] args,Class[] types,ClassType classType)

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
