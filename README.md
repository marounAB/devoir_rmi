# Calculator RMI
dans ce repo on a 4 fichiers java:<br/>
-Calculator.java qui est l'interface ou le contrat que doit implementer le stub, le skeleton et l'implementation de la classe Calculator dans le serveur.<br/>
-CalculatorImpl.java qui est l'implementation de la classe Calculator dans le serveur et a laquelle le client va faire appelle a travers le stub et le skeleton en utilisant java rmi.<br/>
-CalculatorClient.java qui fait appelle a l'objet Calculator distant en utilisant son nom. Ici le client utilise l'objet distant comme si il etait local.<br/>
-CalCulatorServer.java qui crée l'object CalculatorImpl auquel les appels arrivent et lui donne un nom pour qu'il soit accessible au client.<br/>
<br/>
## les print screens<br/>
on commence par lance le rmiregistry:<br/>
![](https://drive.google.com/uc?export=view&id=1A5k8YwR83zaUJyU0FHuCRehcfRPmAyS1)
puis on lance le CalulatorServer:<br/>
![](https://drive.google.com/uc?export=view&id=1TQP5eTYUJG_RwH-kdeDtIkUvTjQjyEOE)
et enfin on lance le CalculatorClient:<br/>
![](https://drive.google.com/uc?export=view&id=1E4MNYh_xtScjc1KzKTxrFFJ_O1rPt-Ig)
