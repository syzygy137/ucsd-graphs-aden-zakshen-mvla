package roadgraph;

import geography.GeographicPoint;


/** Class to hold an element of the PriorityQueue. Relates a point to distance from start and straightline
 * distance to goal.
 * 
 * @author Mr. Murray
 *
 */
public class QueueElement implements Comparable<QueueElement> {
	
	private GeographicPoint point;
    private double distFromStart; 
    private double distPriority;
    
    /** Constructor for Dijsktra search
     * @param pt - current point
     * @param d1 - distance from start to this pt on current path
     */
    public QueueElement(GeographicPoint pt, double d1) 
    {
    	this.point = pt;
    	this.distFromStart = d1;
    	this.distPriority = d1;
    }
    
    public QueueElement(GeographicPoint start, double d, GeographicPoint goal) {
		// TODO Auto-generated constructor stub
    	this.point = start;
    	this.distFromStart = d;
    	this.distPriority = distFromStart + start.distance(goal);
	}

	/** gets the current point
     * @return
     */
    public GeographicPoint getPoint()
    {
    	return point;
    }
    
    /** Gets the best known distance from start at the time this QueueElement
     *  was created.
     * @return
     */
    public double getDistFromStart() 
    {
    	return distFromStart;
    }
    
    /** Gets the distance from the goal
     * @return
     */
    public double getPriorityDistance() {
    	return distPriority;
    }
    
    /** Comparator function for the priority queue for Dijkstra. 
     *
     */
    public int compareTo(QueueElement o )
    {
    	return Double.compare(this.distFromStart,o.getDistFromStart());
    }

}
