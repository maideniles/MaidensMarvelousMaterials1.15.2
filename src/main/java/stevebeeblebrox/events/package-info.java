/**
 * Runtime Event System
 * @author Steve B.
 * @version 1.0.0-min
 * 
 * @apiNote This system will load any *.js, *.es, or *.ns files in the same folder as this jar and evaluate them.
 * If they register a listener method, they will then be send Minecraft Forge Events.
 * Files should be written in ECMAScript 5.1 (Similar to JavaScript)
 * <br>
 * <br>
 * To get the event handler class, use the following script
 * <br>
 * <br>
 * &emsp;<i>var Handler = Java.type("stevebeeblebrox.events.Handler");</i>
 * <br>
 * <br>
 * To register an event listener for the function <i>methodName</i>, use the following
 * <br>
 * <br>
 * &emsp;<i>Handler.register("package.subpackage.EventClass$InnerEventClass", "methodName");</i>
 * <br>
 * <br>
 * To unregister an event listener for the function <i>methodName</i>, use the following
 * <br>
 * <br>
 * &emsp;<i>Handler.unregister("package.subpackage.EventClass$InnerEventClass", "methodName");</i>
 * 
 * @see {@link https://docs.oracle.com/javase/10/nashorn/introduction.htm}
 * @see {@link https://winterbe.com/posts/2014/04/05/java8-nashorn-tutorial/}
 * @see {@link https://web.archive.org/web/20200202011708/http://www.n-k.de:80/riding-the-nashorn/}
 */
package stevebeeblebrox.events;