    var FIELD_SEPARATOR = "_FIELD_SEPARATOR_";   //�ֶ�֮��ķָ��
    var GROUP_SEPARATOR = "_GROUP_SEPARATOR_";     //һ�����֮��ķָ��

    //�����¼�
    function fieldOnKeyPress(){
        var charCode=window.event.keyCode;
        if(charCode==13){  //�س�
            setFieldValue();
        }
        else if(charCode==32){//ESC
            cancelFieldValue();
        }
    }

    //ȡ��
    function cancelFieldValue(){
        parent.fraRight.rows = "100%,0%,0%,0%,0%,0%";
        try
        {
            var index = parseInt(fm.codeindex.value,10);

            if(fraInterface.getSign() == fm.fieldsign.value){
                fmInput.elements[index].value = "";
                fmInput.elements[index].focus();
            }
        }
        catch(e){
        }

        fraInterface.setInquery(false);
        fraInterface.setQueryError(false);
        window.status = "";
    }

    //ȷ��
    function setFieldValue(){

        var codecode;
        var codename;
        var codevalue;

        try
        {
            codevalue = fm.codeselect.options[fm.codeselect.options.selectedIndex].value;
        }
        catch(e1){
            errorMessage("����ѡ����Ҫ�Ĵ���");
            return ;
        }

        try
        {
            parent.fraRight.rows = "100%,0%,0%,0%,0%,0%";
            var index = parseInt(fm.codeindex.value,10);
            var tempIndex = 0;
            var arrCodeValue;
            if(fraInterface.getSign() != fm.fieldsign.value){
                fraInterface.setInquery(false);
                fraInterface.setQueryError(false);
                window.status = "";
                throw new Exception("field not exist!");
            }

            //�������������Ϊcode
            if(fm.inputtype.value=="code"){
                var arrRelation = ("0,"+fm.relation.value).split(","); //�õ�����Ԫ��������������ƫ����
                arrCodeValue = codevalue.split(FIELD_SEPARATOR); //�õ�����Ԫ�ص�ֵ
                for(var i=0;i<arrRelation.length;i++){
                    tempIndex = index+parseInt(arrRelation[i],10); //�õ�Ԫ�ص�ElementIndex
                    if(i>arrCodeValue.length-1){ //��������ĸ������ڲ�ѯ����Ԫ�ص�ֵ�ĸ������������һ��Ĭ��ֵ
                        if(fm.querytype.value=="need"){ //inputtype is code and querytype is need
                            if(isEmpty(fmInput.elements[tempIndex])){
                                fmInput.elements[tempIndex].value = arrCodeValue[arrCodeValue.length-1];
                                fmInput.elements[tempIndex].tag = arrCodeValue[arrCodeValue.length-1];

                                try
                                {
                                    if(fmInput.elements[tempIndex].onchange!=null){
                                        fmInput.elements[tempIndex].onchange();
                                    }
                                }
                                catch(E1){
                                }
                            }
                        }
                        else{
                            fmInput.elements[tempIndex].value = arrCodeValue[arrCodeValue.length-1];
                            fmInput.elements[tempIndex].tag = arrCodeValue[arrCodeValue.length-1];
                            try
                            {
                                if(fmInput.elements[tempIndex].onchange!=null){
                                    fmInput.elements[tempIndex].onchange();
                                }
                            }
                            catch(E2){
                            }
                        }
                    }
                    else{
                        if(fm.querytype.value=="need"){
                            if(isEmpty(fmInput.elements[tempIndex]) || i ==0){ //������������¸�ֵ,����ֵ���ѡ��ֵ
                                fmInput.elements[tempIndex].value = arrCodeValue[i];
                                fmInput.elements[tempIndex].tag = arrCodeValue[i];
                                try
                                {
                                    if(fmInput.elements[tempIndex].onchange!=null){
                                        fmInput.elements[tempIndex].onchange();
                                    }
                                }
                                catch(E3){
                                }
                            }
                        }
                        else{
                            fmInput.elements[tempIndex].value = arrCodeValue[i];
                            fmInput.elements[tempIndex].tag = arrCodeValue[i];
                            try
                            {
                                if(fmInput.elements[tempIndex].onchange!=null){
                                    fmInput.elements[tempIndex].onchange();
                                }
                            }
                            catch(E4){
                            }
                        }
                    }
                }
            }
            else{ //codename
                var arrRelation = ("0,"+fm.relation.value).split(",");
                arrRelation[0] = arrRelation[1];
                arrRelation[1] = "0";

                arrCodeValue = codevalue.split(FIELD_SEPARATOR);
                for(var i=0;i<arrRelation.length;i++){
                    tempIndex = index+parseInt(arrRelation[i],10);
                    if(i>arrCodeValue.length-1){
                        if(fm.querytype.value=="need"){
                            if(isEmpty(fmInput.elements[tempIndex])){
                                fmInput.elements[tempIndex].value = arrCodeValue[arrCodeValue.length-1];
                                fmInput.elements[tempIndex].tag = arrCodeValue[arrCodeValue.length-1];
                                try
                                {
                                    if(fmInput.elements[tempIndex].onchange!=null){
                                        fmInput.elements[tempIndex].onchange();
                                    }
                                }
                                catch(E5){
                                }
                            }
                        }
                        else{
                            fmInput.elements[tempIndex].value = arrCodeValue[arrCodeValue.length-1];
                            fmInput.elements[tempIndex].tag = arrCodeValue[arrCodeValue.length-1];
                            try
                            {
                                if(fmInput.elements[tempIndex].onchange!=null){
                                    fmInput.elements[tempIndex].onchange();
                                }
                            }
                            catch(E6){
                            }
                        }
                    }
                    else{
                        if(fm.querytype.value=="need"){
                            if(isEmpty(fmInput.elements[tempIndex]) || i ==0){
                                fmInput.elements[tempIndex].value = arrCodeValue[i];
                                fmInput.elements[tempIndex].tag = arrCodeValue[i];
                                try
                                {
                                    if(fmInput.elements[tempIndex].onchange!=null){
                                        fmInput.elements[tempIndex].onchange();
                                    }
                                }
                                catch(E7){
                                }
                            }
                        }
                        else{
                            fmInput.elements[tempIndex].value = arrCodeValue[i];
                            fmInput.elements[tempIndex].tag = arrCodeValue[i];
                            try
                            {
                                if(fmInput.elements[tempIndex].onchange!=null){
                                    fmInput.elements[tempIndex].onchange();
                                }
                            }
                            catch(E8){
                            }
                        }
                    }
                }
            }
            fmInput.elements[index].focus();
        }
        catch(e2){
        }

        fraInterface.setInquery(false);
        fraInterface.setQueryError(false);
        window.status = "";
    }
