/* Chinese initialisation for the jQuery UI date picker plugin. */
/* Written by Cloudream (cloudream@gmail.com). */
(function($) {
	$.datepick.regional['zh-CN'] = {
		clearText: '���', clearStatus: '�����ѡ����', 
		closeText: '�ر�', closeStatus: '���ı䵱ǰѡ��',
		prevText: '&#x3c;����', prevStatus: '��ʾ����',
		prevBigText: '&#x3c;&#x3c;', prevBigStatus: '��ʾ��һ��',
		nextText: '����&#x3e;', nextStatus: '��ʾ����',
		nextBigText: '&#x3e;&#x3e;', nextBigStatus: '��ʾ��һ��',
		currentText: '����', currentStatus: '��ʾ����',
		monthNames: ['һ��','����','����','����','����','����',
		'����','����','����','ʮ��','ʮһ��','ʮ����'],
		monthNamesShort: ['һ','��','��','��','��','��',
		'��','��','��','ʮ','ʮһ','ʮ��'],
		monthStatus: 'ѡ���·�', yearStatus: 'ѡ�����',
		weekHeader: '��', weekStatus: '�����ܴ�',
		dayNames: ['������','����һ','���ڶ�','������','������','������','������'],
		dayNamesShort: ['����','��һ','�ܶ�','����','����','����','����'],
		dayNamesMin: ['��','һ','��','��','��','��','��'],
		dayStatus: '���� DD Ϊһ����ʼ', dateStatus: 'ѡ�� m�� d��, DD',
		dateFormat: 'yy-mm-dd', firstDay: 1,
		initStatus: '��ѡ������', isRTL: false};
	$.datepick.setDefaults($.datepick.regional['zh-CN']);
})(jQuery);
