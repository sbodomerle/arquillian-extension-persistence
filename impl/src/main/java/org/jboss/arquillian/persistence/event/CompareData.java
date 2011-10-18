package org.jboss.arquillian.persistence.event;

import java.util.List;

import org.jboss.arquillian.persistence.data.DataSetDescriptor;

public class CompareData extends DataEvent
{

   public CompareData(List<DataSetDescriptor> dataSDataSetDescriptors)
   {
      super(dataSDataSetDescriptors);
   }
   
}