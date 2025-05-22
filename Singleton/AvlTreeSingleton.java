
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.directory.server.i18n.I18n;
public class AvlTreeSingleton<K> implements AvlTree<K>
{
    private final LinkedAvlNode<K> singleton;
    private final Comparator<K> comparator;
    public AvlTreeSingleton( K key, Comparator<K> comparator )
    {
        this.singleton = new LinkedAvlNode<>( key );
        this.comparator = comparator;
    }
    public LinkedAvlNode<K> find( K key )
    {
        if ( key != null && comparator.compare( key, singleton.key ) == 0 )
        {
            return singleton;
        }
        return null;
    }
    public LinkedAvlNode<K> findGreater( K key )
    {
        if ( key != null && comparator.compare( key, singleton.key ) < 0 )
        {
            return singleton;
        }
        return null;
    }
    public LinkedAvlNode<K> findGreaterOrEqual( K key )
    {
        if ( key != null && comparator.compare( key, singleton.key ) <= 0 )
        {
            return singleton;
        }
        return null;
    }
    public LinkedAvlNode<K> findLess( K key )
    {
        if ( key != null && comparator.compare( key, singleton.key ) > 0 )
        {
            return singleton;
        }
        return null;
    }
    public LinkedAvlNode<K> findLessOrEqual( K key )
    {
        if ( key != null && comparator.compare( key, singleton.key ) >= 0 )
        {
            return singleton;
        }
        return null;
    }
    public Comparator<K> getComparator()
    {
        return comparator;
    }
    public LinkedAvlNode<K> getFirst()
    {
        return singleton;
    }
    public List<K> getKeys()
    {
        return Collections.singletonList( singleton.getKey() );
    }
    public LinkedAvlNode<K> getLast()
    {
        return singleton;
    }
    public LinkedAvlNode<K> getRoot()
    {
        return singleton;
    }
    public int getSize()
    {
        return 1;
    }
    public K insert( K key )
    {
        throw new UnsupportedOperationException( I18n.err( I18n.ERR_444 ) );
    }
    public boolean isEmpty()
    {
        return false;
    }
    public void printTree()
    {
        System.out.println( "[ " + singleton + " ]" );
    }
    public K remove( K key )
    {
        throw new UnsupportedOperationException( I18n.err( I18n.ERR_444 ) );
    }
}
