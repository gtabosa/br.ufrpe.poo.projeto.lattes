
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;

public class ConverteData implements Converter{
@Override

public void marshal(Object o, HierarchicalStreamWriter writer, MarshallingContext mc) {
	Date data = (Date)o;
	String dataFormatada = new SimpleDateFormat("dd/MM/YYYY").format(data);
	writer.setValue(dataFormatada);
	//throw new UnsupportedOperationException("Not suported yet");
}
	
@Override
public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext uc) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	Date data = null;
	try {
		data = sdf.parse(reader.getValue());
	} catch (ParseException ex) {
		// TODO Auto-generated catch block
		Logger.getLogger(ConverteData.class.getName()).log(Level.SEVERE, null, ex);
	}
	return data;
}
@Override
public boolean canConvert(Class type) {
	return type.equals(Date.class);
	//throw new UnsupportedOperationException("Not suported yet");
}
	
}
