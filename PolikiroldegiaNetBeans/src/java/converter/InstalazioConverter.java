package converter;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import hibernate.*;
import pojo.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

public class InstalazioConverter implements Converter {

    Session sesioa = HibernateKud.getInstance().getSession();
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        org.hibernate.Transaction tx = null;
        ArrayList lista = new ArrayList();
        try {
            tx = sesioa.beginTransaction();
            Criteria add = HibernateKud.getInstance().getSession().createCriteria(Instalazioa.class).add(Restrictions.eq("izena",value));
            tx.commit();
            lista = (ArrayList) add.list();
            if (lista.size() == 1) {
                return (Instalazioa) lista.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
        return null;
        

    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }
}
